import { IUser } from 'app/core/user/user.model';
import { ICourse } from 'app/shared/model//course.model';

export const enum EntryLevel {
    BEGINNER = 'BEGINNER',
    INTERMEDIATE = 'INTERMEDIATE',
    EXPERT = 'EXPERT'
}

export interface IEnrollment {
    id?: number;
    entryLevel?: EntryLevel;
    user?: IUser;
    courses?: ICourse[];
}

export class Enrollment implements IEnrollment {
    constructor(public id?: number, public entryLevel?: EntryLevel, public user?: IUser, public courses?: ICourse[]) {}
}
